//package com.moha.myproject1;
//import com.moha.myproject1.Staff;
//import com.moha.myproject1.StaffService;
//
//import com.example.demo.model.Staff;
//import com.example.demo.service.StaffService;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/staffs")
//public class StaffController {
//    private final StaffService staffService;
//
//    public StaffController(StaffService staffService) {
//        this.staffService = staffService;
//    }
//
//    @GetMapping
//    public List<Staff> getAllStaffs() {
//        return staffService.getAllStaffs();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Staff> getStaff(@PathVariable Long id) {
//        Staff staff = staffService.getStaffById(id);
//        return staff != null ? ResponseEntity.ok(staff) : ResponseEntity.notFound().build();
//    }
//
//    @PostMapping
//    public Staff createStaff(@RequestBody Staff staff) {
//        return staffService.createStaff(staff);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Staff> updateStaff(@PathVariable Long id, @RequestBody Staff staff) {
//        Staff updated = staffService.updateStaff(id, staff);
//        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteStaff(@PathVariable Long id) {
//        return staffService.deleteStaff(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
//    }
//}
