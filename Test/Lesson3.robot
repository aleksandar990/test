*** Settings ***
Library           SeleniumLibrary

*** Test Cases ***
Proba1
    Open Browser    https://www.google.com/    chrome
    Maximize Browser Window
    Click Element    //div[@class='FPdoLc lJ9FBc']//input[@class="RNmpXc"]
    Sleep    2s
    Close Browser

NormalFOR
    @{elements}    Create List    one    two    three
    FOR    ${i}    IN    @{elements}
        Log    ${i}
    END
