*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${loginLink}   xpath:/html/body/div[2]/div/ul/li[21]/a
${userName}    id:username
${password}    id:password
${submit}    xpath://*[@id="login"]/button
${message}    id:flash

*** Keywords ***
OpenLoginLink
    click Element    ${loginLink}
Login
    [Arguments]    ${name}    ${pass}
    Input Text    ${userName}    ${name}
    Input Password    ${password}    ${pass}
    Click Button    ${submit}