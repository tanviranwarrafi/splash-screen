# Splash Screen

This project is for learning how to make splash screen in android.
### Do not need any xml file in splash screen activity
</br>

### 1. Make custom `theme` in `styles.xml` file
```java
<style name="AppTheme.Launcher">
        <item name="android:windowBackground">@drawable/launcher_screen_with_logo</item>
        <item name="android:windowNoTitle">true</item>
        <item name="android:windowActionBar">false</item>
        <item name="android:windowFullscreen">true</item>
        <item name="android:windowContentOverlay">@null</item>
    </style>
```
</br>

### 2. Make custom `drawable file` in `drawable` folder
```java
<?xml version="1.0" encoding="utf-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android"
    android:opacity="opaque">
    <item android:drawable="@android:color/holo_purple" />

    <item>
        <bitmap
            android:gravity="center"
            android:src="@drawable/home" />
    </item>
</layer-list>
```
</br>

### 3. Now add the custom theme in `AndroidManifest.xml` file for our launcher SplashScreen activity.
```java
<activity android:name=".SplashScreen"
            android:theme="@style/AppTheme.Launcher">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
```
</br>

### 4. At last, In our `SplashScreen.java`, just call MainActivity.java class
```java
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(SplashScreen.this, MainActivity.class));
        finish();
    }
```
</br>

### Screenshot
<img src="screenshot/gif.gif" width="300">
