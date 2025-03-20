import RNFS from 'react-native-fs';
import { PermissionsAndroid } from 'react-native';

async function requestPermissions() {
    try {
      const granted = await PermissionsAndroid.request(
        PermissionsAndroid.PERMISSIONS.WRITE_EXTERNAL_STORAGE,
        {
          title: 'Storage Permission',
          message: 'App needs access to your storage to save files.',
          buttonNeutral: 'Ask Later',
          buttonNegative: 'No',
          buttonPositive: 'Yes',
        },
      );
      if (granted === PermissionsAndroid.RESULTS.GRANTED) {
        console.log('You can save files');
      } else {
        console.log('Storage permission denied');
      }
    } catch (err) {
      console.warn(err);
    }
  }