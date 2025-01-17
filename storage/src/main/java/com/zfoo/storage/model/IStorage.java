/*
 * Copyright (C) 2020 The zfoo Authors
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package com.zfoo.storage.model;

import org.springframework.lang.Nullable;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author godotg
 */
public interface IStorage<K, V> {

    boolean contain(K key);

    boolean contain(int key);

    boolean contain(long key);

    V get(K id);

    V get(int id);

    V get(long id);

    void recycleStorage();

    boolean isRecycle();

    void setRecycle(boolean recycle);

    Collection<V> getAll();

    Map<K, V> getData();

    IdDef getIdDef();

    List<V> getIndex(String indexName, Object key);

    @Nullable
    V getUniqueIndex(String uniqueIndexName, Object key);

    int size();

    V put(Object value);


}
