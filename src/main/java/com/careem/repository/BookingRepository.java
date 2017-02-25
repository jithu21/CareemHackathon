package com.careem.repository;

import com.careem.models.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by apple on 2/24/17.
 */
@Transactional
public interface BookingRepository extends CrudRepository<Booking,Long> {

    /**
     * This method will find an Boooking instance in the database by its departure.
     * Note that this method is not implemented and its working code will be
     * automatically generated from its signature by Spring Data JPA.
     */
    public Booking findByDeparture(String departure);
}
