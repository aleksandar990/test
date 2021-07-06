*** Settings ***
Library           SeleniumLibrary

*** Variables ***
${valid email}    oolloo123@gmail.com

*** Test Cases ***
RegPage from start
    [Setup]    Open Browser    http://automationpractice.com/index.php    chrome
    Maximize Browser Window
    sleep    3s
    Click element    //*[@id="header"]/div[2]/div/div/nav/div[1]/a    #click sign in button
    Wait Until Element Is Visible    //*[@id="email_create"]
    input text    //*[@id="email_create"]    ${valid email}    #typing valid email in create account field
    Click Element    //*[@id="SubmitCreate"]    #click create account button
    Wait Until Element Is Visible    Registration form
    sleep    10s
    [Teardown]    Close Browser
