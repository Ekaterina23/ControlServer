package remindme.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import remindme.server.entity.Remind;
import remindme.server.service.ReminderService;

import java.util.List;

@RestController //аннотация возвращает JSon-объекты
public class ReminderController {

    @Autowired /*аннотация, которая проинициализирует наш объект*/
    private ReminderService service;

    @RequestMapping(value = "/reminders", method = RequestMethod.GET)//доступ по url=/reminders
    @ResponseBody
    public List<Remind> getAllReminders()//получение всех
    {
        return service.getAll();
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)//доступ по url=/reminders
    @ResponseBody
    public Remind getReminder(@PathVariable("id") long remindId)//получение одного по id
    {
        return service.getById(remindId);
    }

    @RequestMapping(value = "/reminders", method = RequestMethod.POST)
    @ResponseBody
    public Remind saveReminder(@RequestBody Remind remind)//сохранение или обновление записи
    {
        return service.save(remind);
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.DELETE)//доступ по url=/reminders
    @ResponseBody
    public void deleteReminder(@PathVariable long id)//удаление по id
    {
        service.remove(id);
    }

    }

