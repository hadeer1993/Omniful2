*** Settings ***
Library    SeleniumLibrary
Resource    TestBase.robot
Resource    ../Pages/LoginPage.robot

Test Setup    TestBase.StartDriver
Test Teardown    CloseDriver

*** Test Cases ***
CheckLogin
    LoginPage.OpenLoginLink
    Wait Until Page Contains Element    ${submit}    
    Login    test    test
    Set Selenium Implicit Wait    3s
    Element Should Contain    ${message}    Your username is invalid!    