import SwiftUI
struct default_buttons: View {
    
    var body: some View {
        VStack
        {
            Rectangle()
                .frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
            HStack
            {
                Button(action: {})
                {
                    Text("Cancel")
                        .foregroundColor(.black)
                }
                .frame(minWidth:0,idealWidth:0)
                .background(Color.blue)
                Button(action: {})
                {
                    Text("Save")
                        .foregroundColor(.black)
                }
                .frame(minWidth:0,idealWidth:0)
                .background(Color.blue)
            }
            .frame(minWidth:0,maxWidth:.infinity)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        .padding(.top,5)}}

struct default_buttons_Previews: PreviewProvider {
    static var previews: some View {
        default_buttons()
    }
}
