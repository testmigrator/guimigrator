import SwiftUI
struct dialog_single_input: View {
    
    var body: some View {
        VStack
        {
            TextField("", text: .constant(""))
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct dialog_single_input_Previews: PreviewProvider {
    static var previews: some View {
        dialog_single_input()
    }
}
