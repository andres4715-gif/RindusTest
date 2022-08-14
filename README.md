[![rindus logo](https://media-exp1.licdn.com/dms/image/C4E0BAQGcggLVrlH-og/company-logo_200_200/0/1646387619000?e=1666224000&v=beta&t=usSleOj8PEBfoMIB7yKvcKYioZhJcD_efqZfMNvERWw "rindus logo")](https://media-exp1.licdn.com/dms/image/C4E0BAQGcggLVrlH-og/company-logo_200_200/0/1646387619000?e=1666224000&v=beta&t=usSleOj8PEBfoMIB7yKvcKYioZhJcD_efqZfMNvERWw "rindus logo")


------------
# Rindus test app.

This project was made to run e2e tests and individual test cases with the aim to make automated tests interacting with the application with different flows.

### Download from github:

It is possible to clone the repositorio just visiting the github page and clone with this command line on you terminal.

**Steps:**

1. Choose any location on your local machine
2. Open your terminal in this local addrees
3. Add the repository link on your terminal: https://github.com/andres4715-gif/RindusTest.git
4. Please make sure you are in the master branch.

------------

## Steps using intellij Idea IDE.

##### Option 1.

1. Open the project from intellij idea IDE
2. Open the POM.xml file
3. Right click on the POM.xml file
4. Choose Maven
5. Choose Reload project
6. Wait while the whole list of dependencies are install

##### Option 2.

1. On the right side IDE you can see the maven tap.
2. Click on maven tap.
3. Choose the Lifecycle option.
4. Tap on install.
5. Wait while the whole list of dependencies are install

------------

## You will need to install those tools to work with this project.

1. Intellj IDEA
2. Maven
3. Appium
4. Appium inspector
5. Android Studio

### Keep in mind:

To execute the automation script you must be created an VDM (Virtual Device Manager) device in Android Studio and the SDK manager with the correct path on the environment variables.

To check if everything is okay write on the local terminal this piece of code:

`$ adb devices`

You should see something like the following:

```shell
adb devices
List of devices attached
emulator-5554   device
```

------------

## For Appium Inspector you will need this capabilities

Example:

```json
{
  "platformName": "Android",
  "appium:platformVersion": "9",
  "appium:deviceName": "Pixel3API28",
  "appium:automationName": "UiAutomator2",
  "appium:app": "/Users/andresrios/Desktop/RindusTest/App/rindustest.apk"
}
```

------------

## Run the Test Suite:

Keep in mind, this project has maven to manage the whole list of dependencies and you will need to install it in order to download the complete list of libraries used on it

### It is possible to run this project in two ways:

##### Option 1.

1. Within the project tap over **src** folder.
2. Tap over the runner folder.
3. Open the RunTest file.
4. Right Click within the RunTest file choose **Run "RunTest"**.
5. Wait for the execution results.

##### Option 2.

1. Within the project tap over **TestSuite** folder
2. Open the TestNG.xml file
3. Right Click within the RunTest file choose **Run /testSuite/TestNG.xml**
4. Wait for the execution results.

------------

## Automated test cases:

| Name  | Type  | Status  |
| ------------ | ------------ | ------------ |
|Tap on an element | Action |Done|
|Confirm elements are present|Action| Done |
|  Checkmark an element |  Action |  Done |
| Add and delete task  | e2e flow  | Done  |

