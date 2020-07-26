
public class TelephoneNumberUtils {

	private static final String TELEPHONE_PREFIX = "+4912345678";
	private static final int EXTENSION_MIN_LENGTH = 2;
	private static final int EXTENSION_MAX_LENGTH = 4;

	public static String extractExtension(String telephonNumber) {
		if (telephonNumber != null && telephonNumber.startsWith(TELEPHONE_PREFIX)) {
			String extension = telephonNumber.substring(TELEPHONE_PREFIX.length());
			if (EXTENSION_MIN_LENGTH <= extension.length() && EXTENSION_MAX_LENGTH >= extension.length()) {
				return extension;
			} else {
				return "";
			}
		} else {
			return "";
		}
	}

}
