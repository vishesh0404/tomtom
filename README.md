# tomtom
# Project Name - E-commerce

Spring Boot Class -  EcommerceApplication

Database used - Mysql


Steps to configure and Run for the first time.

	* Database - Mysql
		database Name - ecommerce
	* Maven Update
	* EcommerceApplication - Run as spring boot application
	* After Running the application Scema will be auto generated
	* run the following queries in database - 
				INSERT INTO `ecommerce`.`user` (`id`, `name`, `password`, `user_type`, `username`) VALUES ('1', 'Seller', 'pass', 'SELLER', 'seller');
				INSERT INTO `ecommerce`.`user` (`id`, `name`, `password`, `user_type`, `username`) VALUES ('2', 'User', 'pass', 'USER', 'user');
				INSERT INTO `ecommerce`.`cart` (`id`, `total_items`, `user_id`, `total_amount`) VALUES ('1', '0', '2', '0');
				
	* URL - http://localhost:8080/ (Use User or Seller credentials for their respective portal scops)
