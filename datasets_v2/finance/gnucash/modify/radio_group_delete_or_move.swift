import SwiftUI
struct radio_group_delete_or_move: View {
    @State private  var RadioButtona14  : String?
    @State private  var RadioButtonbdf  : String?
    @State private  var RadioButton7c2  : String?
    @State private  var RadioButtonc48  : String?
    @State private  var RadioButton48f  : String?
    var body: some View {
        VStack
        {
            Text("Transactions")
                .bold()
            Text("This account contains transactions. \nWhat would you like to do with these transactions")
                .frame(minWidth:0,maxWidth:.infinity)
                .font(.system(size: 12))
            Button(action: { RadioButton48f = "Delete sub-accounts" })
            {
                HStack
                {
                    Image(systemName: RadioButtonbdf == "Delete sub-accounts" ? "checkmark.circle.fill" : "circle")
                    Text("Delete sub-accounts")
                        .foregroundColor(.black)
                }
            }
            .frame(minWidth:0,maxWidth:.infinity)
            Button(action: { RadioButton7c2 = "Move to:" })
            {
                HStack
                {
                    Image(systemName: RadioButtonc48 == "Move to:" ? "checkmark.circle.fill" : "circle")
                    Text("Move to:")
                        .foregroundColor(.black)
                }
            }
            List
            {
                ForEach(1..<10)
                {
                    index in
                    Text("Item \(index)")
                }
            }
            .frame(minWidth:0,maxWidth:.infinity)
            .listStyle(PlainListStyle())
        }}}

struct radio_group_delete_or_move_Previews: PreviewProvider {
    static var previews: some View {
        radio_group_delete_or_move()
    }
}
