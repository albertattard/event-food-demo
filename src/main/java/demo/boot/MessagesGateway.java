package demo.boot;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessagesGateway {

  @RabbitListener( queues = "${app.queue.food}" )
  public void handleFoodPreference( final FoodPreference preference ) {
    System.out.printf( "Received food preference %s%n", preference );
  }

  @RabbitListener( queues = "${app.queue.event}" )
  public void handleCreateEvent( final CreateEvent event ) {
    System.out.printf( "Received new event %s%n", event );
  }
}
