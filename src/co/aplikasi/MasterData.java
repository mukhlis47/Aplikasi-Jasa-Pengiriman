/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.aplikasi;

/**
 *
 * @author user
 */
public class MasterData {
    private String deliveryType;
    private final double insurance = 0.03;
    private String destination;
    private double regularService; 
    private double kilatService;
    private double someDayService;
    private double overNightService;
    private double holidayDeliveryService;

    /**
     * @return the deliveryType
     *
     */
    
    
    public MasterData() {
    }

    public MasterData(String deliveryType, String destination, double regularService, double kilatService, double someDayService, double overNightService, double holidayDeliveryService) {
        this.deliveryType = deliveryType;
        this.destination = destination;
        this.regularService = regularService;
        this.kilatService = kilatService;
        this.someDayService = someDayService;
        this.overNightService = overNightService;
        this.holidayDeliveryService = holidayDeliveryService;
    }
    

    public String getDeliveryType() {
        return deliveryType;
    }

    /**
     * @param deliveryType the deliveryType to set
     */
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the regularService
     */
    public double getRegularService() {
        return regularService;
    }

    /**
     * @param regularService the regularService to set
     */
    public void setRegularService(double regularService) {
        this.regularService = regularService;
    }

    /**
     * @return the kilatService
     */
    public double getKilatService() {
        return kilatService;
    }

    /**
     * @param kilatService the kilatService to set
     */
    public void setKilatService(double kilatService) {
        this.kilatService = kilatService;
    }

    /**
     * @return the someDayService
     */
    public double getSomeDayService() {
        return someDayService;
    }

    /**
     * @param someDayService the someDayService to set
     */
    public void setSomeDayService(double someDayService) {
        this.someDayService = someDayService;
    }

    /**
     * @return the overNightService
     */
    public double getOverNightService() {
        return overNightService;
    }

    /**
     * @param overNightService the overNightService to set
     */
    public void setOverNightService(double overNightService) {
        this.overNightService = overNightService;
    }

    /**
     * @return the holidayDeliveryService
     */
    public double getHolidayDeliveryService() {
        return holidayDeliveryService;
    }

    /**
     * @param holidayDeliveryService the holidayDeliveryService to set
     */
    public void setHolidayDeliveryService(double holidayDeliveryService) {
        this.holidayDeliveryService = holidayDeliveryService;
    }

    @Override
    public String toString() {
        return this.destination;
    }

}
