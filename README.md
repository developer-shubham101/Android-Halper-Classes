# Android-Halper-Classes

## Ask Permisstion with PermissionClass 

implements PermissionClass.PermissionRequire

Override these methods


// if permission is Deny
void permissionDeny();

// if permission is Granted
void permissionGranted();

//Send permission's list
String[] listOfPermission();

@Override
public String[] listOfPermission() {
    return new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}; 
}

create ImagePickerClass object and call method

imagePickerClass.onActivityResult(requestCode, resultCode, data);
inside activity onActivityResult()


@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    imagePickerClass.onActivityResult(requestCode, resultCode, data);
}