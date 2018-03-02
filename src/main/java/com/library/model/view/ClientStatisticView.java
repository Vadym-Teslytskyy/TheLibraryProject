package com.library.model.view;

import java.math.BigDecimal;

public class ClientStatisticView {

    private Double averageClientsAge;
    private Double averageUsingLibraryDaysCount;
    private BigDecimal averageRentsCountByPeriod;

    public ClientStatisticView(Double averageClientsAge, Double averageUsingLibraryDaysCount,
                               BigDecimal averageRentsCountByPeriod) {
        this.averageClientsAge = averageClientsAge;
        this.averageUsingLibraryDaysCount = averageUsingLibraryDaysCount;
        this.averageRentsCountByPeriod = averageRentsCountByPeriod;
    }

    public Double getAverageClientsAge() {
        return averageClientsAge;
    }

    public void setAverageClientsAge(Double averageClientsAge) {
        this.averageClientsAge = averageClientsAge;
    }

    public Double getAverageUsingLibraryDaysCount() {
        return averageUsingLibraryDaysCount;
    }

    public void setAverageUsingLibraryDaysCount(Double averageUsingLibraryDaysCount) {
        this.averageUsingLibraryDaysCount = averageUsingLibraryDaysCount;
    }

    public BigDecimal getAverageRentsCountByPeriod() {
        return averageRentsCountByPeriod;
    }

    public void setAverageRentsCountByPeriod(BigDecimal averageRentsCountByPeriod) {
        this.averageRentsCountByPeriod = averageRentsCountByPeriod;
    }
}
