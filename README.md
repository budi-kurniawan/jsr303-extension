## JSR303-Extension for Hibernate Validator

Unfortunately, as at March 2016, the latest release of Hibernate Validator (version 5.2.4) is not able to verify java.time.LocalDate, a very important class in the new Java Date-Time API. This extension is very simple and consists of only one class, PastValidatorForTemporal.java. To use it with Hibernate Validator, you need to register the extension with Hibernate Validator. An easy way to achieve this is by modifying the ConstraintHelper class.
 
