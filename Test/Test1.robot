*** Settings ***
Resource          ../locators/Helloworld.robot.txt

*** Variables ***

*** Test Cases ***
HelloWorld
    Log    Zdravo jas se vikam ${firstName}
    Log    se prezivam ${lastName}
