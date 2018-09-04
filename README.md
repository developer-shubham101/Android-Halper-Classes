# Android-Halper-Classes

## Ask Permisstion with PermissionClass 

implements PermissionClass.PermissionRequire

Override these methods

```
// if permission is Deny<br />
void permissionDeny();

// if permission is Granted<br />
void permissionGranted();

//Send permission's list<br />
String[] listOfPermission();
```
<br /><br />
```
@Override
public String[] listOfPermission() {<br />
    return new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}; <br />
}```
<br />
create ImagePickerClass object and call method<br />

imagePickerClass.onActivityResult(requestCode, resultCode, data);<br />
inside activity onActivityResult()<br /><br />

```
@Override<br />
protected void onActivityResult(int requestCode, int resultCode, Intent data) {<br />
    super.onActivityResult(requestCode, resultCode, data);<br />
    imagePickerClass.onActivityResult(requestCode, resultCode, data);<br />
}```