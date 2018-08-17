# SpringBoot_Server1

## SpringBoot_Server1 is a server part of microservice application built using Spring Boot.

This server part of application is deployed on Heroku and has base url address - https://spring-boot-server1.herokuapp.com . 
User or client part of application can use this address with adding part of url, which determined for every of available methods in this server. Methods are accessible to apply:

* uploadFile(@RequestParam("file") MultipartFile file) - use with adding "/uploadFile" to base url and through POST request,
 also put file to be added into the body of request.
 * uploadImage(@RequestParam("file") MultipartFile file) - use with adding "/uploadImage" to base url and through POST request,
 also put file(image type) to be added into the body of request.
 * uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) - use with adding "/uploadMultipleFiles" to base url and through POST request,
 also put all the files to be added into the body of request.
 * downloadFile(@PathVariable String fileName, HttpServletRequest request) - use with adding "/downloadFile/{fileName}" to base url and through GET request,
replacing {fileName} with name of file you need to be downloaded.

![alt](https://image.ibb.co/mHVx7e/spring_boot_server_upload.jpg)
![alt](https://image.ibb.co/dDwtfz/spring_boot_server_download.jpg)
