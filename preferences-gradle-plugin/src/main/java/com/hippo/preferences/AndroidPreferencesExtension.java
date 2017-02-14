/*
 * Copyright 2017 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.preferences;

/*
 * Created by Hippo on 2/14/2017.
 */

import com.android.annotations.NonNull;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;

public class AndroidPreferencesExtension {

  private List<Preference> preferences = Lists.newArrayList();

  public List<Preference> getPreferences() {
    return ImmutableList.copyOf(preferences);
  }

  public void setPreferences(@NonNull Iterable<Preference> preferenceIterable) {
    preferences = Arrays.asList(Iterables.toArray(preferenceIterable, Preference.class));
  }
}
