import SwiftUI
struct missing_chat_file_store: View {

    var body: some View {
        ScrollView
        {
            VStack
            {
                Text("Chat Media Store Missing")
                    .frame(minWidth:300,idealWidth:300)
                    .padding(20)
                Text("Your chat logs are stored on the SD Card, but the file is missing from the current SD Card.  Please insert the correct SD Card, or delete the existing chat log and launch ChatSecure again.")
                    .frame(minWidth:300,idealWidth:300)
                HStack
                {
                    Button(action: {})
                    {
                        Text("Delete Chat Log")
                            .foregroundColor(.black)
                    }
                    
                    Button(action: {})
                    {
                        Text("Shutdown & Lock")
                            .foregroundColor(.black)
                    }
                 
                }
                .padding(12)
            }
            .background(.white)
            .padding(12)
        }
        .background(.red)
    }}

struct missing_chat_file_store_Previews: PreviewProvider {
    static var previews: some View {
        missing_chat_file_store()
    }
}
