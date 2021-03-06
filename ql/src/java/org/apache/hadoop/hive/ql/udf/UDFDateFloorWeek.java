/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hive.ql.udf;

import org.apache.hadoop.hive.ql.exec.Description;

/**
 * UDFDateFloorWeek.
 *
 * Converts a timestamp to a timestamp with week granularity.
 */
@Description(name = "floor_week",
    value = "_FUNC_(param) - Returns the timestamp at a week granularity",
    extended = "param needs to be a timestamp value\n"
    + "Example:\n "
    + "  > SELECT _FUNC_(CAST('yyyy-MM-dd HH:mm:ss' AS TIMESTAMP)) FROM src;\n"
    + "  yyyy-MM-xx 00:00:00")
public class UDFDateFloorWeek extends UDFDateFloor {

  public UDFDateFloorWeek() {
    super("WEEK");
  }

}
