*** Settings ***
Library           SeleniumLibrary

*** Test Cases ***
Proba2
    Open Browser    http://automationpractice.com    chrome
    Maximize Browser Window
    Sleep    2s
    Click element    //*[@id="header"]/div[2]/div/div/nav/div[1]/a
    sleep    2s
    Click Element    //*[@id="email"]
    Close Browser
