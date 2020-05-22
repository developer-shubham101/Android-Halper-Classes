package in.newdevpoint.ssandroidchat.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import com.downloader.OnCancelListener;
import com.downloader.OnDownloadListener;
import com.downloader.OnPauseListener;
import com.downloader.OnProgressListener;
import com.downloader.OnStartOrResumeListener;
import com.downloader.PRDownloader;
import com.downloader.Progress;
import com.downloader.request.DownloadRequest;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import in.newdevpoint.ssandroidchat.BroadCastConstants;
import in.newdevpoint.ssandroidchat.activities.ChatActivity;

public class FileOpenUtility {


	public static void openFile(Activity a, String url) {
		// Create URI
		Uri uri = Uri.parse(url);

		Intent intent = null;
		// Check what kind of file you are trying to open, by comparing the url with extensions.
		// When the if condition is matched, plugin sets the correct intent (mime) type,
		// so Android knew what application to use to open the file

		if (url.contains(".doc") || url.contains(".docx")) {
			// Word document
			intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(uri, "application/msword");
		} else if (url.contains(".pdf")) {
			// PDF file
			intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(uri, "application/pdf");
		} else if (url.contains(".ppt") || url.contains(".pptx")) {
			// Powerpoint file
			intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(uri, "application/vnd.ms-powerpoint");
		} else if (url.contains(".xls") || url.contains(".xlsx")) {
			// Excel file
			intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(uri, "application/vnd.ms-excel");
		} else if (url.contains(".rtf")) {
			// RTF file
			intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(uri, "application/rtf");
		} else if (url.contains(".wav")) {
			// WAV audio file
			intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(uri, "audio/x-wav");
		} else if (url.contains(".gif")) {
			// GIF file
			intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(uri, "imageUrl/gif");
		} else if (url.contains(".jpg") || url.contains(".jpeg")) {
			// JPG file
			intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(uri, "imageUrl/jpeg");
		} else if (url.contains(".png")) {
			// PNG file
			intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(uri, "imageUrl/png");
		} else if (url.contains(".txt")) {
			// Text file
			intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(uri, "text/plain");
		} else if (url.contains(".mpg") || url.contains(".mpeg") || url.contains(".mpe") || url.contains(".mp4") || url.contains(".avi")) {
			// Video files
			intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(uri, "video/*");
		} else if (url.contains(".zip") || url.contains(".rar")) {
			// ZIP Files
			intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(uri, "application/zip");
		}
		//if you want you can also define the intent type for any other file

		//additionally use else clause below, to manage other unknown extensions
		//in this case, Android will show all applications installed on the device
		//so you can choose which application to use


		else {
			intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(uri, "*/*");
		}

		a.startActivity(intent);
	}

}