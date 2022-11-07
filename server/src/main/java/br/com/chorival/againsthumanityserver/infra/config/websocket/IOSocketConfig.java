package br.com.chorival.againsthumanityserver.infra.config.websocket;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class IOSocketConfig {

        @Value("${application.socket.host}")
        private String socketHost;

        @Value("${application.socket.port}")
        private int port;

        @Bean
        public SocketIOServer socketIOServer() {
                Configuration config = new Configuration();
                config.setHostname(socketHost);
                config.setPort(port);
                return new SocketIOServer(config);
        }

}
