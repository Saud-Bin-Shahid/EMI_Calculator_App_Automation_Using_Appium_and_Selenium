# EMI_Calculator_App_Automation_Using_Appium_and_Selenium
This repository contains automation for an EMI calculator. 
The calculator is able to calculate monthly EMI, total interest, total processing fee, and total payment after receiving inputs like amount, interest, loan period, and processing fee. 
In this project, four sets of test data have been used as a test case.

# Tools and Technology
- Appium
- Android Studio
- Appium Inspector
- Selenium Webdriver
- Java
- TestNG


# Pre-requisites
- JDK
- Gradle
- Appium

# To run this project
- Clone this project
- Give this following command for checking the connectivity with emulator : ``` adb devices ```
- Open Appium Server with this following command:``` appium ```
- Open Appium Inspector
- Set desired capabilites in json format & click Start Session:
  ```
  {
  "platformName": "android",
  "appium:platformVersion": "11",
  "appium:automationName": "UIAutomator2",
  "appium:appPackage": "com.continuum.emi.calculator",
  "appium:appActivity": "com.finance.emicalci.activity.Splash_screnn",
  "appium:app": "D:\\apk\\emi_calculator.apk"
  }
    ```
- open the project with build gradle
- open the terminal and write the following command ``` gradle clean test ```

# Reports
![screencapture-192-168-31-108-50054-index-html-2023-11-27-18_16_03](https://github.com/Saud-Bin-Shahid/EMI_Calculator_App_Automation_Using_Appium_and_Selenium/assets/134185250/2d852c04-639b-48d0-a194-94349171bddc)
![screencapture-192-168-31-108-50054-index-html-2023-11-27-18_16_14](https://github.com/Saud-Bin-Shahid/EMI_Calculator_App_Automation_Using_Appium_and_Selenium/assets/134185250/3d386dda-5262-42ef-9f99-5f5e02a7a808)

# Video Output Link
https://drive.google.com/file/d/1JYRWx3dj20nqaiw9HOw6ctkIJgyp8qd4/view?usp=sharing
