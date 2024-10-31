import SwiftUI
struct activity_currency_picker: View {
    
    var body: some View {
        ZStack
        {
            List
            {
                ForEach(1..<10)
                {
                    index in
                    Text("Item \(index)")
                }
            }
            .listStyle(PlainListStyle())
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_currency_picker_Previews: PreviewProvider {
    static var previews: some View {
        activity_currency_picker()
    }
}
