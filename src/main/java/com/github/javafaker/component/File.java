package com.github.javafaker.component;

import com.github.javafaker.Faker;
import com.github.javafaker.FakerElement;

public class File extends FakerElement {
	
    /**
	 * @param faker
	 */
	public File(Faker faker) {
		super(faker);
	}

	public String extension() {
        return faker.resolve("file.extension");
    }
    
    public String mimeType() {
        return faker.resolve("file.mime_type");
    }

    public String fileName() {
        return fileName(null, null, null, null);
    }

    public String fileName(String dirOrNull, String nameOrNull, String extensionOrNull, String separatorOrNull) {
        final String sep = separatorOrNull == null ? System.getProperty("file.separator") : separatorOrNull;
        final String dir = dirOrNull == null ? faker.internet().slug() : dirOrNull;
        final String name = nameOrNull == null ? faker.lorem().word().toLowerCase() : nameOrNull;
        final String ext = extensionOrNull == null ? extension() : extensionOrNull;
        return new StringBuilder(dir).append(sep).append(name).append(".").append(ext).toString();
    }
}
