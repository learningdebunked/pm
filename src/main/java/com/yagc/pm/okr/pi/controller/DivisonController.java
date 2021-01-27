package com.yagc.pm.okr.pi.controller;

/**
 * @author Kapil
 * @created 26/01/2021 - 8:02 AM
 * @project pi
 */
public class DivisonController {

    //TODO Create a REST End point like POST : /division to create a division
    /**
     * The attributes that can go in a division
     * {
     *     "divison_name":"cg",
     *     "rte": "",
     *     "plt":"",
     *     "okr":{
     *         //how do these maps to CEO;s OKR
     *     }
     * }
     */

    //POST:/division_key{}/scrumteam/{scrumteam_key}
    /**
     * The attributes for scrum team could be
     * {
     *
     *
     *     "rte":"Kapil"
     *     "plt":"",
     *     "team":{
     *         "name":"",
     *         "em":"",
     *         "po":"",
     *         "engineers":[{
     *                 "name":"",
     *                 "role":"",
     *                 "capacity": {
     *                     "total_sprint_capacity":"",
     *                     "engineers_availability":"",
     *                     "engineers_unavailability":"",
     *                     "capacity_eval" : "person_sprints"
     *                 }
     *                 "areaofexp":"" //fe/be/fullstack/automation/manual,
     *                 "capacity_leave"
     *
     *         }],
     *         "capacity":{
     *   *             "front_end":[{
     *                 "total" : "" ,//
     *                 "available": "" ,
     *                 "unavailable":{
     *                     "breakdown": {
     *                         //embed the engineers object here again from above
     *                     }
     *                 },
     *             }],
     *             "back_end":[{
     *                       "total" : "" ,//
     *                      "available": "" ,
     *                       "unavailable":{
     *                          "breakdown": {
     *                               //embed the engineers object here again from above
     *                           }
     *                       },
     *                   }],
     *             "testing":"",
     *             "architecture":"",
     *         }
     *     }
     *
     *
     * }
     */
}
