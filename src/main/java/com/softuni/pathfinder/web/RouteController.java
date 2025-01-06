package com.softuni.pathfinder.web;

import com.softuni.pathfinder.service.RouteService;
import com.softuni.pathfinder.service.dto.RouteShortInfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RouteController {

    //test git again

    private RouteService routeService;

    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/routes")
    public String routes(Model model){

        //Testing

        //RouteShortInfoDTO randomRoute = routeService.getRandomRoute();

        List<RouteShortInfoDTO> routes = routeService.getAll();

        model.addAttribute("allRoutes", routes);

        return "routes";

    }
}
