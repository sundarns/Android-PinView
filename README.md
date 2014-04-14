Android-PinView is a iOS-like Pin Entry/Challenge Activity for Android. The component has the following features:
1. If the app is being accessed for the first time then it asks for the PIN to be set
2. Uses Android SharedPreferences to store the password
3. For subsequent access to the app, it asks for the PIN to be entered
4. onResume of the main activity, the PINEntry activity is called asking the user for the PIN


To Do:
1. Forgot PIN
2. Accept non-numeric PINs
3. Encrypt the PIN while storing in SharedPreferences
4. Add customizability to add logo, change color scheme

