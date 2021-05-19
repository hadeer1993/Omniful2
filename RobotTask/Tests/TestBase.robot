*** Settings ***
Library    SeleniumLibrary
Library    AppiumLibrary

*** Variables ***
${url}    https://the-internet.herokuapp.com/
${driver}    chrome

*** Keywords ***
StartDriver
    Open Browser    ${url}    ${driver}
    Maximize Browser Window
CloseDriver
    Close Browser