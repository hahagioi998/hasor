/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.dataway.schema.types;
/**
 * 数组或集合类型
 */
public class ArrayType extends Type {
    /** 获取集合中的对象类型 */
    private Type genricType;

    public TypeEnum getType() {
        return TypeEnum.Array;
    }

    public Type getGenricType() {
        return genricType;
    }

    public void setGenricType(Type genricType) {
        this.genricType = genricType;
    }
}