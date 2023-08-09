package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.models.Seat;
import com.scaler.bookmyshow.models.Show;
import com.scaler.bookmyshow.models.ShowSeat;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import java.util.List;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {

//    @Query("select * from shows where startTime FOR UPDATE")
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    List<ShowSeat> findAllBySeatInAndShow(List<Seat> seats, Show show);

    ShowSeat save(ShowSeat showSeat);
}
