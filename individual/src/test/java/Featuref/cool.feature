Feature: Registering into the one cool summer
Scenario: Performing the user registration 
@Regis
Given User in the registration form
When User enters required data
| Fields | Values | 
| FirstName | Pavithra |
|LastName | Palani | 
|phone | 9003403857|
| email | pavi@gmail.com|
| Address | Venu Street |
|City | Tirupattur |
|State| Melbourne | 
|pin| 635601| 
|country| AUSTRALIA | 
|userName| Pavithra2|
|password| Pavithra@123| 
|confirmPassword| Pavithra@123 | 
Then Registration should be success