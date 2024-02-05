package com.example.proyectogrupal.Controller;

import com.example.proyectogrupal.entity.UserAdmin;
import com.example.proyectogrupal.services.UserAdminServicesContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserAdminController {
    private final UserAdminServicesContract userAdminServicesContract;

    @Autowired
    public UserAdminController(UserAdminServicesContract userAdminServicesContract) {
        this.userAdminServicesContract = userAdminServicesContract;
    }

    @GetMapping
    public List<UserAdmin> allUserAdmin() {
        return userAdminServicesContract.allUserAdmin();
    }

    @PostMapping
    public UserAdmin save(@RequestBody UserAdmin userAdmin) {
        return userAdminServicesContract.save(userAdmin);
    }

    @PutMapping("/update/{name}")
    public void modify(@RequestBody UserAdmin userAdmin) {
        userAdminServicesContract.update(userAdmin);
    }

    @DeleteMapping("/delete/{name}")
    public void deleteByNameStudent(@PathVariable String userNameAdmin) {
        userAdminServicesContract.delete(userNameAdmin);
    }
}
