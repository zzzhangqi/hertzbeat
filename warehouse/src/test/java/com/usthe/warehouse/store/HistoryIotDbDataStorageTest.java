package com.usthe.warehouse.store;

import com.usthe.common.entity.dto.Value;
import com.usthe.common.entity.message.CollectRep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author hujiaofen
 * @since 31/10/2022
 */
class HistoryIotDbDataStorageTest extends BaseDataStorageTest {
    @Resource
    private HistoryIotDbDataStorage storage;

    @BeforeEach
    void setUp() {
        Assertions.assertNotNull(storage);
    }

    @Test
    void isServerAvailable() {
        Assertions.assertTrue(storage.isServerAvailable());
    }

    @Test
    void saveData() {
        storage.saveData(initTestMetricsData());
    }

    @Test
    void destroy() {
        storage.destroy();
    }

    @Test
    void getHistoryMetricData() {
        CollectRep.MetricsData metricsData = initTestMetricsData();
        for (int i = 0; i < metricsData.getFieldsList().size(); i++) {
            CollectRep.Field field = metricsData.getFields(i);
            CollectRep.ValueRow valueRow = metricsData.getValues(i);
            Map<String, List<Value>> data = storage.getHistoryMetricData(
                    metricsData.getId(),
                    metricsData.getApp(),
                    metricsData.getMetrics(),
                    field.getName(),
                    null,
                    "6h");
            List<Value> valueList = data.get(field.getName());
            Assertions.assertEquals(valueList.get(0).getOrigin(), valueRow.getInstance());
        }
    }

    @Test
    void getHistoryIntervalMetricData() {
        CollectRep.MetricsData metricsData = initTestMetricsData();
        for (int i = 0; i < metricsData.getFieldsList().size(); i++) {
            CollectRep.Field field = metricsData.getFields(i);
            CollectRep.ValueRow valueRow = metricsData.getValues(i);
            Map<String, List<Value>> data = storage.getHistoryIntervalMetricData(
                    metricsData.getId(),
                    metricsData.getApp(),
                    metricsData.getMetrics(),
                    field.getName(),
                    null,
                    "6h");
            List<Value> valueList = data.get(field.getName());
            Assertions.assertEquals(valueList.get(0).getOrigin(), valueRow.getInstance());
        }
    }
}
