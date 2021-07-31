/*
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.coru.kloadgen.randomtool.util;

import java.util.Set;

public class ValidType {

  // Map type values
  public static final String INT_ARRAY = "int-array";

  public static final String LONG_ARRAY = "long-array";

  public static final String DOUBLE_ARRAY = "double-array";

  public static final String SHORT_ARRAY = "short-array";

  public static final String FLOAT_ARRAY = "float-array";

  public static final String STRING_ARRAY = "string-array";

  public static final String UUID_ARRAY = "uuid-array";

  public static final String BOOLEAN_ARRAY = "boolean-array";

  // Array type values
  public static final String INT_MAP = "int-map";

  public static final String LONG_MAP = "long-map";

  public static final String DOUBLE_MAP = "double-map";

  public static final String SHORT_MAP = "short-map";

  public static final String FLOAT_MAP = "float-map";

  public static final String STRING_MAP = "string-map";

  public static final String UUID_MAP = "uuid-map";

  public static final String BOOLEAN_MAP = "boolean-map";

  // Object values
  public static final String FLOAT = "float";

  public static final String ARRAY = "array";

  public static final String MAP = "map";

  public static final String ENUM = "enum";

  public static final String STRING = "string";

  public static final String INT = "int";

  public static final String LONG = "long";

  public static final String TIMESTAMP = "timestamp";

  public static final String STRING_TIMESTAMP = "stringTimestamp";

  public static final String SHORT = "short";

  public static final String DOUBLE = "double";

  public static final String LONG_TIMESTAMP = "longTimestamp";

  public static final String UUID = "uuid";

  public static final String BOOLEAN = "boolean";

  public static final String BYTES = "bytes";

  public static final Set<String> VALID_OBJECT_TYPES = Set.of(
      ARRAY, MAP, ENUM, STRING, INT, LONG, TIMESTAMP, STRING_TIMESTAMP, SHORT, DOUBLE, LONG_TIMESTAMP, UUID, BOOLEAN, BYTES
  );

  private ValidType() {

  }
}
