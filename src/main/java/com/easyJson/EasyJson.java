/**************************************************
 * EasyGson is open-sourced software licensed under the MIT license.
 * https://opensource.org/licenses/MIT
 ***************************************************/

package com.easyJson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.Consumer;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class EasyJson {
	JsonElement wrappedJsonElement;

	/**
	 * 
	 * @param json
	 */
	public EasyJson(JsonElement jsonElt) {
		this.wrappedJsonElement = jsonElt;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public JsonElement getWrappedJsonElement() {
		return wrappedJsonElement;
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public Integer getInteger(String path) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt == null || jsonElt.isJsonNull()) {
			return null;
		} else {
			return jsonElt.getAsInt();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public Integer getInteger() {
		return this.wrappedJsonElement.getAsInt();
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public String getString(String path) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt == null || jsonElt.isJsonNull()) {
			return null;
		} else {
			return jsonElt.getAsString();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public String getString() {
		return this.wrappedJsonElement.getAsString();
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public Boolean getBoolean(String path) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt == null || jsonElt.isJsonNull()) {
			return null;
		} else {
			return jsonElt.getAsBoolean();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public Boolean getBoolean() {
		return this.wrappedJsonElement.getAsBoolean();
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public Float getFloat(String path) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt == null || jsonElt.isJsonNull()) {
			return null;
		} else {
			return jsonElt.getAsFloat();
		}
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public Double getDouble(String path) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt == null || jsonElt.isJsonNull()) {
			return null;
		} else {
			return jsonElt.getAsDouble();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public Double getDouble() {
		return this.wrappedJsonElement.getAsDouble();
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public Long getLong(String path) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt == null || jsonElt.isJsonNull()) {
			return null;
		} else {
			return jsonElt.getAsLong();
		}
	}

	/**
	 * 
	 * @return
	 */
	public Long getLong() {
		return this.wrappedJsonElement.getAsLong();
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public BigDecimal getBigDecimal(String path) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt == null || jsonElt.isJsonNull()) {
			return null;
		} else {
			return jsonElt.getAsBigDecimal();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public BigDecimal getBigDecimal() {
		return this.wrappedJsonElement.getAsBigDecimal();
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public BigInteger getBigInteger(String path) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt == null || jsonElt.isJsonNull()) {
			return null;
		} else {
			return jsonElt.getAsBigInteger();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public BigInteger getBigInteger() {
		return this.wrappedJsonElement.getAsBigInteger();
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public Byte getByte(String path) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt == null || jsonElt.isJsonNull()) {
			return null;
		} else {
			return jsonElt.getAsByte();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public Byte getByte() {
		return this.wrappedJsonElement.getAsByte();
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public Character getCharacter(String path) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt == null || jsonElt.isJsonNull()) {
			return null;
		} else {
			return jsonElt.getAsCharacter();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public Character getCharacter() {
		return this.wrappedJsonElement.getAsCharacter();
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public Number getNumber(String path) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt == null || jsonElt.isJsonNull()) {
			return null;
		} else {
			return jsonElt.getAsNumber();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public Number getNumber() {
		return this.wrappedJsonElement.getAsNumber();
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public Short getShort(String path) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt == null || jsonElt.isJsonNull()) {
			return null;
		} else {
			return jsonElt.getAsShort();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public Short getShort() {
		return this.wrappedJsonElement.getAsShort();
	}

	/**
	 * 
	 * @param path
	 * @param consumer
	 */
	public void iterate(String path, Consumer<EasyJson> consumer) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt != null && !jsonElt.isJsonNull() && jsonElt instanceof JsonArray) {
			JsonArray arr = jsonElt.getAsJsonArray();

			for (JsonElement arrElt : arr) {
				consumer.accept(new EasyJson(arrElt));
			}
		}
	}

	/**
	 * 
	 * @param path
	 * @param consumer
	 */
	public void iterateRaw(String path, Consumer<JsonElement> consumer) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt != null && !jsonElt.isJsonNull() && jsonElt instanceof JsonArray) {
			JsonArray arr = jsonElt.getAsJsonArray();

			for (JsonElement arrElt : arr) {
				consumer.accept(arrElt);
			}
		}
	}

	/**
	 * 
	 * @param consumer
	 */
	public void iterate(Consumer<EasyJson> consumer) {
		JsonElement jsonElt = this.wrappedJsonElement;

		if (jsonElt != null && !jsonElt.isJsonNull() && jsonElt instanceof JsonArray) {
			JsonArray arr = jsonElt.getAsJsonArray();

			for (JsonElement arrElt : arr) {
				consumer.accept(new EasyJson(arrElt));
			}
		}
	}

	/**
	 * 
	 * @param consumer
	 */
	public void iterateRaw(Consumer<JsonElement> consumer) {
		JsonElement jsonElt = this.wrappedJsonElement;

		if (jsonElt != null && !jsonElt.isJsonNull() && jsonElt instanceof JsonArray) {
			JsonArray arr = jsonElt.getAsJsonArray();

			for (JsonElement arrElt : arr) {
				consumer.accept(arrElt);
			}
		}
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public JsonObject getJsonObject(String path) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt == null || jsonElt.isJsonNull()) {
			return null;
		} else {
			return jsonElt.getAsJsonObject();
		}
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	public JsonArray getJsonArray(String path) {
		JsonElement jsonElt = getLastJsonEltInPath(path);

		if (jsonElt == null || jsonElt.isJsonNull()) {
			return null;
		} else {
			return jsonElt.getAsJsonArray();
		}
	}

	/**
	 * 
	 * @param path
	 * @return
	 */
	private JsonElement getLastJsonEltInPath(String path) {
		String[] properties = path.split("\\.");
		JsonObject jsonObj = this.wrappedJsonElement.getAsJsonObject();
		int len = properties.length - 1;

		for (int i = 0; i < len; i++) {
			String prop = properties[i];
			JsonElement jsonElement = jsonObj.get(prop);

			if (jsonElement.isJsonNull()) {
				return null;
			}

			jsonObj = jsonElement.getAsJsonObject();

			if (jsonObj == null) {
				return null;
			}
		}

		String prop = properties[properties.length - 1];
		JsonElement jsonElement = jsonObj.get(prop);

		if (jsonElement == null || jsonElement.isJsonNull()) {
			return null;
		} else {
			return jsonElement;
		}
	}
}
