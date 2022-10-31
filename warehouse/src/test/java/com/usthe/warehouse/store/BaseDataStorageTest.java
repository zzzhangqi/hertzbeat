package com.usthe.warehouse.store;

import com.usthe.common.entity.message.CollectRep;

/**
 * @author hujiaofen
 * @since 31/10/2022
 */
public class BaseDataStorageTest {

    CollectRep.MetricsData initTestMetricsData() {
        return CollectRep.MetricsData.newBuilder()
                .setId(1)
                .setMetrics("example")
                .setApp("example")
                .setFields(0,
                        CollectRep.Field.newBuilder()
                                .setName("field")
                                .setType(0))
                .setValues(0,
                        CollectRep.ValueRow
                                .newBuilder()
                                .setInstance("value")
                                .addColumns("field"))
                .build();
    }

}
