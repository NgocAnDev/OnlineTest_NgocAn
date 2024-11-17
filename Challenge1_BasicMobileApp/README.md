# Currency Converter App

## Overview
This is a simple Currency Converter app built for Android using Kotlin. It allows users to input an amount, select the currencies to convert from and to, and view the converted result. The app utilizes a MVC pattern to separate business logic and UI.

## App Structure
- **MainActivity**: The entry point of the app, where the user interacts with the app. It handles input, currency selection, and conversion requests.
- **ConverterController**: The logic for performing currency conversion.
- **ConverterView**: Responsible for handling the UI components like displaying results and managing the currency spinners.
- **Apiservice: API interface that uses Retrofit to get rates from an external service.
- **RetrofitClient: Provides a Retrofit client to connect and retrieve data from the API.
- **edittext_border:Defines a shape with a white background and rounded corners
- **res/layout/activity_main.xml**: The layout file for the main screen where users input values and see the results.

## Steps to Build and Run the App
1. Clone this repository to your local machine.
2. Open the project in Android Studio.
3. Ensure that you have the necessary SDKs installed and the emulator or physical device connected.
4. Build and run the app via Android Studio.
5. The app should start, and you can input an amount, select currencies, and convert.

## Additional Notes and Challenges
- One of the main challenges was implementing proper error handling for invalid inputs (e.g., non-numeric characters or excessive decimal places).
- Another challenge was ensuring smooth interaction between the different components, such as the spinner for currency selection and the result display.
  
## Technical Constraints
- Limited to a set of four currencies: AED, AFN, AOA, BMD, CUP, CZK , EUR, GBP, GBP, GHS, USD, VND.
- The application currently supports up to 6 digits after the decimal point when entering data
