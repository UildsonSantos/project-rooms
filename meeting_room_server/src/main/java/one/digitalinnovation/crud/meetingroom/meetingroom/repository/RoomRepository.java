package one.digitalinnovation.crud.meetingroom.meetingroom.repository;

import one.digitalinnovation.crud.meetingroom.meetingroom.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
