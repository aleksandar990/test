*** Settings ***
Library           SeleniumLibrary
Resource          ../keywords/Log.robot.txt
Resource          ../locators/variables.robot.txt

*** Variables ***

*** Test Cases ***
Lesson4
    [Setup]
    Open Browser    https://the-internet.herokuapp.com/    chrome
    Maximize Browser Window
    Click Link    //*[@id="content"]/ul/li[6]/a
    Select Checkbox    //*[@id="checkboxes"]/input[1]
    Unselect Checkbox    //*[@id="checkboxes"]/input[2]
    sleep    3s
    Unselect Checkbox    //*[@id="checkboxes"]/input[1]
    Select Checkbox    //*[@id="checkboxes"]/input[2]
    Select Checkbox    //*[@id="checkboxes"]/input[1]
    sleep    3s
    Unselect Checkbox    //*[@id="checkboxes"]/input[1]
    Unselect Checkbox    //*[@id="checkboxes"]/input[2]
    sleep    3s
    Close Browser
    [Teardown]

Lesson 5
    Open Browser    https://the-internet.herokuapp.com/    chrome
    Maximize Browser Window
    Click Link    //*[@id="content"]/ul/li[11]/a
    Select From List By Label    //*[@id="dropdown"]    Option 1
    sleep    3s
    Close Browser

Lesson 6
    Open Browser    https://the-internet.herokuapp.com/    chrome
    Maximize Browser Window
    sleep    3s
    Switch Window    https://www.google.com/
    sleep    3s
    Close Window

lesson 7
    Open Browser    https://the-internet.herokuapp.com/    chrome
    Maximize Browser Window
    Click Link    //*[@id="content"]/ul/li[22]/a
    Click Link    //*[@id="content"]/div/ul/li[2]/a
    Textfield Should Contain    //*[@id="tinymce"]    majmune jadean
    sleep    3s
    close browser

Login
    [Setup]    Open Browser    http://automationpractice.com    chrome
    Maximize Browser Window
    loginn
    order
    [Teardown]    Close Browser

RegisterAccount
    [Setup]    Open Browser    http://automationpractice.com    chrome    # setup to open browser
    Maximize Browser Window
    sleep    2s
    register
    [Teardown]    Close Browser    # tear dowsn to close browser

Log
    [Setup]    Open Browser    http://automationpractice.com    chrome    # setup to open browser
    Maximize Browser Window
    Login as registered user
    Navigate to PLP
    Select product from PLP
    Add product to cart
    Continue shopping
    Again navigate to PLP
    Select again product from PLP
    Choose quantity
    Choose size
    Add another product to cart
    Proceed to check out
    Remove product
    Confirm order
    Confirm Adress
    Shippin and Agree on Terms and Conditions
    Select Payment
    Pay
    [Teardown]    Close Browser    # tear dowsn to close browser

*** Keywords ***
