@all
Feature: Register Account
As an unregistered user, I want to open an account

@register @fewDetails @smoke @regression 
Scenario: Creating an account by giving the details
Given user navigates to register page
When user enters details in the below fields
|firstname      |prathyusha|
|lastname       |kaja|
|emailaddress   |ksprathyusha2000@gmail.com|
|telephone      |3687687358|
|password       |Sai@2000|
|passwordconfirm|Sai@2000|
And clicks on Privacy Policy field
Then clicks on Continue button

@register @allDetails @regression
Scenario: Creating an account by giving all the details
Given user navigates to register page
When user enters details in the below fields
|firstname      |prathyusha|
|lastname       |kaja|
|emailaddress   |ksprathyusha2000@gmail.com|
|telephone      |3687687358|
|password       |Sai@2000|
|passwordconfirm|Sai@2000|
* selects Yes option for the Subscribe field
* clicks on Privacy Policy field
Then clicks on Continue button
