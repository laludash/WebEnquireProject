package WebEnquireForm.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import WebEnquireForm.Service.Adminservice;
import WebEnquireForm.domain.ApiOne;
import WebEnquireForm.domain.LoginApi;
import WebEnquireForm.reposiroty.*;



@RestController 
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private ApiOneRepo  ApiOneRepo;
	
	@Autowired 
	private LoginApiRepo  LoginApiRepo;
	
	@Autowired
	private Adminservice  adminservice;
	
	
	
	
	
	// api one   ----> 
	@CrossOrigin
	@PostMapping("/Postenquiry")
	public  ResponseEntity<?> addEnquire(@RequestBody ApiOne  ApiOne)
	{
		try
		{
			Status status = new Status();
			List<Status> status1 = new ArrayList<>();
		String methodName="EnquiryPost";
		if(!ApiOne.equals(null))
		{
			//AvailabilityRepo.save(availability);
			 ApiOneRepo.save(ApiOne);
			String message="Success";
			String status2="saved successfully";
			status.setMessage(message);
			status.setStatus(status2);
			status1.add(status);
			//long company_id = availability.getCompany_id();
			int Id  = ApiOne.getId() ;  
			String firstname     =  ApiOne.getFirstname()  ;
			 String lastname  = ApiOne.getLastname();
			 String emailid = ApiOne.getEmailid();
			 String mobilenumber   = ApiOne.getMobilenumber();
			 String remark  = ApiOne.getRemark();
			
			 return new ResponseEntity<>(status1, HttpStatus.CREATED);
			
		}
	//	return null;
		
		else
		{
			String message="Failed";
			String status2="not saved";
			status.setMessage(message);
			status.setStatus(status2);
			status1.add(status);
			return new ResponseEntity<>(status1, HttpStatus.CREATED);
			
			
		}
		}
		catch(Exception e)
		{
			String exception = e.toString();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
	}
	// login api for get method 
	

	@GetMapping("/GetEnquiryDetail")
	public ResponseEntity<?>  getEnquiryDetail()
	{
		String methodName= "getEnquiry";
		Status status = new Status();
		String message="No data";
		String status2="Failed";
		List<Status> status1 = new ArrayList<>();
		try
		{
			//List<Availability>  available  = new ArrayList<>();
			List<ApiOne>  available  = adminservice.getEnquiry();
			if(!available.isEmpty())
			{
				return new ResponseEntity<List<ApiOne>>(available, HttpStatus.OK);
				
			}
			else
			{
				status.setMessage(message);
				status.setStatus(status2);
				status1.add(status);
				return new ResponseEntity<>(status1, HttpStatus.OK);
			}
			
		}catch(Exception e)
		{
			
		System.out.println(" Fail ");
  String exception = e.toString();
			
		//	Email.exceptionEmail(exception, methodName);
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}
	
	
	
	
	
	

	
	//Login Api
	// for authetication  
	
		@RequestMapping(value="/RegisterUserDetail", method=RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE})
		public LoginApi createUserToken(@RequestBody LoginApi  loginapi)
		{
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String encodedPassword = passwordEncoder.encode(loginapi.getPassword());
	     	loginapi.setPassword(encodedPassword);
		//	user.setPassword(encodedPassword);
			 System.out.println("successs  registration details ");
			return LoginApiRepo.save(loginapi);
			
		}
		
	
	
	
	
	
	
	
	
	
	
	
}
