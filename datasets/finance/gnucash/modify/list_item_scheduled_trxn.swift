import SwiftUI
struct list_item_scheduled_trxn: View {
    @State private  var checkbox  = false
    var body: some View {
        HStack
        {
            Button(action: { self.checkbox.toggle() })
            {
                HStack
                {
                    Image(systemName: checkbox ? "checkmark.square" : "square")
                    Text("null")
                        .foregroundColor(.black)
                }
            }
            .background(Color.blue)
            ZStack
            {
                VStack
                {
                    HStack
                    {
                        Text("Description")
                            .font(.system(size: 15))
                            .truncationMode(.tail)
                        Text("Amount")
                            .foregroundColor(Color(.gray))
                            .truncationMode(.middle)
                            
                    }
                    Text("Description")
                        .lineLimit(2)
                        .truncationMode(.tail)
                }
            }
            .frame(minWidth:0,idealWidth:0)
            .padding(.leading,5)
            .padding(.leading,5)
        }
        .frame(minWidth:0,maxWidth:.infinity)}}

struct list_item_scheduled_trxn_Previews: PreviewProvider {
    static var previews: some View {
        list_item_scheduled_trxn()
    }
}
