/*
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.coru.kloadgen.randomtool.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.coru.kloadgen.model.ConstraintTypeEnum;
import net.coru.kloadgen.randomtool.util.ValidTypeConstants;
import org.apache.commons.lang3.RandomUtils;

public class RandomArray {

  private final RandomObject randomObject;

  public RandomArray() {
    randomObject = new RandomObject();
  }

  public Object generateArray(String fieldType, Integer valueLength, List<String> fieldValueList, Integer arraySize,
      Map<ConstraintTypeEnum, String> constrains) {
    Object value;

    switch (fieldType) {
      case ValidTypeConstants.INT_ARRAY:
        value = generate(ValidTypeConstants.INT, arraySize, valueLength, fieldValueList, constrains);
        break;
      case ValidTypeConstants.LONG_ARRAY:
        value = generate(ValidTypeConstants.LONG, arraySize, valueLength, fieldValueList, constrains);
        break;
      case ValidTypeConstants.DOUBLE_ARRAY:
        value = generate(ValidTypeConstants.DOUBLE, arraySize, valueLength, fieldValueList, constrains);
        break;
      case ValidTypeConstants.SHORT_ARRAY:
        value = generate(ValidTypeConstants.SHORT, arraySize, valueLength, fieldValueList, constrains);
        break;
      case ValidTypeConstants.FLOAT_ARRAY:
        value = generate(ValidTypeConstants.FLOAT, arraySize, valueLength, fieldValueList, constrains);
        break;
      case ValidTypeConstants.STRING_ARRAY:
        value = generate(ValidTypeConstants.STRING, arraySize, valueLength, fieldValueList, constrains);
        break;
      case ValidTypeConstants.UUID_ARRAY:
        value = generate(ValidTypeConstants.UUID, arraySize, 0, fieldValueList, Collections.emptyMap());
        break;
      case ValidTypeConstants.BOOLEAN_ARRAY:
        value = generate(ValidTypeConstants.BOOLEAN, arraySize, 0, fieldValueList, Collections.emptyMap());
        break;
      default:
        value = new ArrayList<>();
        break;
    }

    return value;
  }

  private List<Object> generate(String type, Integer arraySize, Integer valueLength, List<String> fieldValueList,
      Map<ConstraintTypeEnum, String> constrains) {
    int size = arraySize == 0 ? RandomUtils.nextInt(1, 5) : arraySize;
    List<Object> array = new ArrayList<>(size);

    for (int i = 0; i < size; i++) {
      array.add(randomObject.generateRandom(type, valueLength, fieldValueList, constrains));
    }

    return array;
  }
}
