# 📷 QR Code Scanner & Generator – Android

A simple **QR Code Scanner and Generator Application** built using **Android Studio (Java + XML)**.

This project was created to explore Android development by combining **camera integration** with **QR code generation** functionality in a single app.

Users can scan QR codes using their device camera and also generate their own QR codes from custom text input.

---

## ✨ Features

* 📷 Scan QR codes using device camera
* 🧾 Display scanned content instantly
* ➕ Generate new QR codes from text
* 🖼 Preview generated QR codes
* 📋 Copy scanned or generated content
* ⚡ Fast and simple user experience

---

## 📱 App Overview

This application provides two main functionalities:

### QR Scanner

* Open camera scanner
* Detect QR codes instantly
* Show scanned information on screen

### QR Generator

* Enter any text or link
* Generate QR code instantly
* View generated QR image

---

## 🛠️ Built With

* **Java**
* **XML**
* **Android Studio**
* **ZXing Library (QR Scanner & Generator)**

---

## 📂 Project Structure

```plaintext
app/
│
├── java/
│   └── MainActivity.java
│
├── res/
│   └── layout/
│       └── activity_main.xml
│
└── AndroidManifest.xml
```

---

## 🚀 How to Run

1. Clone this repository

```bash
git clone https://github.com/your-username/qr-code-scanner.git
```

2. Open the project in **Android Studio**

3. Sync Gradle files

4. Run the application on:

   * Android Emulator
   * Physical Android Device

---

## 📦 Dependencies

Add these dependencies in:

```plaintext
build.gradle (:app)
```

```gradle
implementation 'com.journeyapps:zxing-android-embedded:4.3.0'
implementation 'com.google.zxing:core:3.5.3'
```

---

## 🔐 Permissions

Add camera permission inside:

```plaintext
AndroidManifest.xml
```

```xml
<uses-permission android:name="android.permission.CAMERA"/>

<uses-feature
android:name="android.hardware.camera"
android:required="false"/>
```

---

## 🎯 Learning Outcomes

This project helped me practice:

* Camera integration in Android
* QR code generation and scanning
* Working with external libraries
* Handling user input and UI interactions
* Building complete Android applications

---

## 🔮 Future Improvements

Features that can be added later:

* 🌙 Dark mode
* 💾 Save generated QR codes
* 📜 Scan history
* 🔗 Share QR codes
* 📂 Scan from gallery images
* 🎨 Material Design UI improvements

---

## 🤝 Contributions

Suggestions and improvements are welcome.

Feel free to fork the repository and explore new features.

---

⭐ If you found this project useful, consider giving it a star.
