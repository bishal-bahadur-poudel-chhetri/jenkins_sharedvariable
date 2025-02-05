def call(String message, String color, String channel) {
    def slackToken = credentials('slack-token')
    slackSend(
        channel: channel,
        color: color,
        message: message,
        tokenCredentialId: slackToken.id
    )
}