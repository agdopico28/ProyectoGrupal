package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.entity.Enrollment;
import com.example.proyectogrupal.entity.Schedule;
import com.example.proyectogrupal.services.ScheduleServicesContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {
    private final ScheduleServicesContract scheduleServicesContract;

    @Autowired
    public ScheduleController(ScheduleServicesContract scheduleServicesContract) {
        this.scheduleServicesContract = scheduleServicesContract;
    }

    @GetMapping
    public List<Schedule> allSchedule() {
        return scheduleServicesContract.allSchedule();
    }

    @PostMapping
    public void save(@RequestBody Schedule schedule ) {
        scheduleServicesContract.save(schedule);
    }

    @PostMapping("/update/{id}")
    public void modify(@RequestBody Schedule schedule) {
        scheduleServicesContract.update(schedule);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        scheduleServicesContract.delete(id);
    }
}
